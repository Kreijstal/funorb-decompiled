/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements Runnable {
    go field_b;
    static byte[] field_a;
    static cj field_d;
    volatile boolean field_h;
    volatile boolean field_c;
    volatile gp[] field_f;
    static ag field_i;
    static hk field_e;
    static uc field_g;

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 == -256) {
              var6_int = param5;
              var7 = 0;
              L1: while (true) {
                if (var6_int <= var7) {
                  stackOut_69_0 = var6_int;
                  stackIn_70_0 = stackOut_69_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param1.charAt(var7);
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
                          if (var8 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (8364 == var8) {
                        param4[var7 + param0] = (byte) -128;
                        break L2;
                      } else {
                        if (8218 == var8) {
                          param4[var7 + param0] = (byte) -126;
                          break L2;
                        } else {
                          if (var8 == 402) {
                            param4[param0 + var7] = (byte) -125;
                            break L2;
                          } else {
                            if (var8 == 8222) {
                              param4[param0 - -var7] = (byte) -124;
                              break L2;
                            } else {
                              if (var8 == 8230) {
                                param4[var7 + param0] = (byte) -123;
                                break L2;
                              } else {
                                if (var8 == 8224) {
                                  param4[param0 + var7] = (byte) -122;
                                  break L2;
                                } else {
                                  if (var8 != 8225) {
                                    if (var8 == 710) {
                                      param4[param0 + var7] = (byte) -120;
                                      break L2;
                                    } else {
                                      if (var8 != 8240) {
                                        if (var8 == 352) {
                                          param4[var7 + param0] = (byte) -118;
                                          break L2;
                                        } else {
                                          if (var8 != 8249) {
                                            if (var8 == 338) {
                                              param4[var7 + param0] = (byte) -116;
                                              break L2;
                                            } else {
                                              if (var8 != 381) {
                                                if (var8 == 8216) {
                                                  param4[var7 + param0] = (byte) -111;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8217) {
                                                    param4[param0 + var7] = (byte) -110;
                                                    break L2;
                                                  } else {
                                                    if (var8 == 8220) {
                                                      param4[param0 + var7] = (byte) -109;
                                                      break L2;
                                                    } else {
                                                      if (var8 == 8221) {
                                                        param4[var7 + param0] = (byte) -108;
                                                        break L2;
                                                      } else {
                                                        if (var8 == 8226) {
                                                          param4[var7 + param0] = (byte) -107;
                                                          break L2;
                                                        } else {
                                                          if (var8 != 8211) {
                                                            if (var8 == 8212) {
                                                              param4[param0 + var7] = (byte) -105;
                                                              break L2;
                                                            } else {
                                                              if (732 != var8) {
                                                                if (var8 == 8482) {
                                                                  param4[var7 + param0] = (byte) -103;
                                                                  break L2;
                                                                } else {
                                                                  if (353 != var8) {
                                                                    if (var8 != 8250) {
                                                                      if (var8 != 339) {
                                                                        if (var8 != 382) {
                                                                          if (var8 != 376) {
                                                                            param4[var7 + param0] = (byte) 63;
                                                                            break L2;
                                                                          } else {
                                                                            param4[param0 - -var7] = (byte) -97;
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          param4[var7 + param0] = (byte) -98;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param4[param0 + var7] = (byte) -100;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      param4[param0 - -var7] = (byte) -101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param4[param0 - -var7] = (byte) -102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                param4[var7 + param0] = (byte) -104;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            param4[param0 + var7] = (byte) -106;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                param4[param0 + var7] = (byte) -114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param4[param0 + var7] = (byte) -117;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        param4[var7 + param0] = (byte) -119;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    param4[param0 - -var7] = (byte) -121;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    param4[var7 + param0] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 10;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("tg.H(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          L7: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(0).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L7;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ')');
        }
        return stackIn_70_0;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ja var9 = null;
        ja var10 = null;
        ja var11 = null;
        ja var12 = null;
        ja var13 = null;
        Object var14 = null;
        int[] var15 = null;
        ja var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = oo.field_i;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = oo.field_b;
          var8 = oo.field_l;
          var9 = new ja(3, -6 + param1);
          var9.a();
          oo.a(0, 0, 3, -6 + param1, param4, param2);
          var10 = new ja(3, 3);
          if (param5 > 25) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          var10.a();
          oo.e(0, 0, 3, 3, param4);
          var11 = new ja(16, 3);
          var11.a();
          oo.e(0, 0, 16, 3, param4);
          var12 = new ja(3, 3);
          var12.a();
          oo.e(0, 0, 3, 3, param2);
          var13 = new ja(16, 3);
          var13.a();
          oo.e(0, 0, 16, 3, param2);
          var14 = null;
          if (param0 <= 0) {
            break L1;
          } else {
            var16 = new ja(16, 16);
            var14 = (Object) (Object) var16;
            var16.a();
            oo.e(0, 0, 16, 16, param0);
            break L1;
          }
        }
        oo.a(var20, var7, var8);
        return new ja[]{var10, var11, var10, var9, (ja) var14, var9, var12, var13, var12};
    }

    final static int b(int param0) {
        if (fn.field_i < 2) {
          return 0;
        } else {
          L0: {
            if (p.field_e == 0) {
              if (ra.field_l.a((byte) -124)) {
                if (!ra.field_l.a(false, "commonui")) {
                  return 40;
                } else {
                  if (!fe.field_L.a((byte) -111)) {
                    return 50;
                  } else {
                    if (!fe.field_L.a(false, "commonui")) {
                      return 60;
                    } else {
                      if (!wm.field_V.a((byte) -117)) {
                        return 70;
                      } else {
                        if (!wm.field_V.a(0)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                return 20;
              }
            } else {
              L1: {
                if (null == cp.field_P) {
                  break L1;
                } else {
                  if (cp.field_P.a((byte) -116)) {
                    if (cp.field_P.a("", 2)) {
                      if (!cp.field_P.a(false, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (ra.field_l.a((byte) -115)) {
                if (!ra.field_l.a(false, "commonui")) {
                  return 57;
                } else {
                  if (!fe.field_L.a((byte) -115)) {
                    return 71;
                  } else {
                    if (!fe.field_L.a(false, "commonui")) {
                      return 80;
                    } else {
                      if (!wm.field_V.a((byte) -122)) {
                        return 82;
                      } else {
                        if (wm.field_V.a(0)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    }
                  }
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        uc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        uc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new uc(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tg.C(");
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
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
        return stackIn_1_0;
    }

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!eb.a((byte) -126, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!eb.a((byte) 110, param0.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_29_0 = var5.toString();
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          } else {
                            stackOut_27_0 = null;
                            stackIn_28_0 = stackOut_27_0;
                            return (String) (Object) stackIn_28_0;
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (lo.a(8192, (char) var7)) {
                              var8 = qf.a(28233, (char) var7);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                StringBuilder discarded$1 = var5.append((char) var8);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("tg.F(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + false + ')');
        }
        return stackIn_30_0;
    }

    final static void a(byte param0, boolean param1, int param2) {
        er var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        er var17_ref = null;
        cj var18 = null;
        ja var19 = null;
        ja var20 = null;
        ja stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        ja stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        ja stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        ja stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        ja stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        ja stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        ja stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        ja stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        ja stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        ja stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        ja stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        ja stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        L0: {
          var17 = null;
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == -7) {
            L1: {
              if (null != np.field_m) {
                np.field_m.b(true, 1);
                break L1;
              } else {
                break L1;
              }
            }
            if (af.field_e == null) {
              break L0;
            } else {
              af.field_e.b(true, 1);
              break L0;
            }
          } else {
            if (param2 == -2) {
              L2: {
                gk.a(2, 1).b(0);
                oo.f(0, 0, 640, 480, 0, 128);
                var18 = vb.a(21262);
                if (var18 != null) {
                  L3: {
                    var4 = var18.field_zb / 2 + var18.field_w;
                    var5 = -6 + (var18.field_qb + var18.field_z - 48);
                    oo.h(3 + var18.field_w, var18.field_qb, -6 + var18.field_w + var18.field_zb, var18.field_qb + var18.field_z + -3);
                    e.field_e.field_g = 0;
                    e.field_e.field_k = 420 + -var4 + -(var18.field_zb / 4);
                    kk.field_w.a(-10136, e.field_e);
                    kk.field_w.field_P = nk.a(1052688, 455739624, ll.field_k.field_p[1]);
                    var6 = 0;
                    var7 = 30;
                    var8 = 0;
                    var9 = 7;
                    var10 = wf.field_m / var7 % var9 - -var8;
                    var19 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[0], 255, ll.field_k.field_p[0]);
                    og.h((byte) 126);
                    var19.g(var4 - var18.field_zb / 4, var5);
                    var7 = 45;
                    var6 = 1;
                    var10 = (wf.field_m - -3) / var7 % var9 + var8;
                    var20 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[1], 255, ll.field_k.field_p[1]);
                    og.h((byte) 119);
                    var20.b(var18.field_zb / 4 + var4, var5);
                    oo.h(3 + var18.field_w, var18.field_qb, var18.field_zb + (var18.field_w - 6), -3 + (var18.field_qb - -var18.field_z));
                    var12 = 1;
                    var6 = (int)(1.1 * (double)wf.field_m) / 64 % 10;
                    var8 = gg.field_l[var12];
                    var7 = gg.field_b[var12];
                    var9 = gg.field_j[var12];
                    var13 = (int)((double)wf.field_m * 1.1) % 64;
                    var10 = (8 + wf.field_m) / var7 % var9 + var8;
                    var14 = var4 - -8;
                    var15 = 50 - -var5 + (3 - var13);
                    stackOut_5_0 = wq.field_c[var6][var10];
                    stackOut_5_1 = var14;
                    stackOut_5_2 = var15;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    if (var13 < 48) {
                      stackOut_7_0 = (ja) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = 256;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      break L3;
                    } else {
                      stackOut_6_0 = (ja) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = stackIn_6_2;
                      stackOut_6_3 = 64 + -var13 << 4;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      break L3;
                    }
                  }
                  L4: {
                    ((ja) (Object) stackIn_8_0).c(stackIn_8_1, stackIn_8_2, stackIn_8_3);
                    var14 = -8 + var4;
                    var10 = var8 + (3 + wf.field_m) / var7 % var9;
                    var6 = (wf.field_m + 13) / 64 % 10;
                    var13 = (13 + wf.field_m) % 64;
                    var15 = 3 + (50 - -var5) - var13;
                    stackOut_8_0 = wq.field_c[var6][var10];
                    stackOut_8_1 = var14;
                    stackOut_8_2 = var15;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    if (var13 < 48) {
                      stackOut_10_0 = (ja) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = 256;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      break L4;
                    } else {
                      stackOut_9_0 = (ja) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = -var13 + 64 << 4;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_11_3 = stackOut_9_3;
                      break L4;
                    }
                  }
                  ((ja) (Object) stackIn_11_0).c(stackIn_11_1, stackIn_11_2, stackIn_11_3);
                  if (400 > wf.field_m % 1000) {
                    int discarded$2 = qp.field_w.a(nq.field_A, 80 + var4, -30 + var5, 100, 50, 16777215, 65793, 1, 0, 0);
                    oo.c();
                    tm.a(vk.i((byte) -39), false);
                    br.a(vk.i((byte) -39), 2);
                    pm.a(false, vk.i((byte) -39));
                    break L0;
                  } else {
                    if ((500 + wf.field_m) % 1000 >= 400) {
                      oo.c();
                      break L2;
                    } else {
                      int discarded$3 = qp.field_w.a(wm.field_P, -130 + var4, var5 - 30, 100, 50, 16777215, 65793, 1, 0, 0);
                      oo.c();
                      tm.a(vk.i((byte) -39), false);
                      br.a(vk.i((byte) -39), 2);
                      pm.a(false, vk.i((byte) -39));
                      break L0;
                    }
                  }
                } else {
                  break L2;
                }
              }
              tm.a(vk.i((byte) -39), false);
              br.a(vk.i((byte) -39), 2);
              pm.a(false, vk.i((byte) -39));
              break L0;
            } else {
              gk.a(2, param2).b(0);
              gk.a(2, param2).a(true);
              gk.a(2, param2).d(4);
              break L0;
            }
          }
        }
        L5: {
          if (!am.a(-110)) {
            break L5;
          } else {
            ui.a(param1, false);
            break L5;
          }
        }
        L6: {
          var17_ref = (er) (Object) bh.field_d.c(104);
          var3 = var17_ref;
          if (param0 <= -8) {
            break L6;
          } else {
            tg.a((byte) -77, false);
            break L6;
          }
        }
        L7: {
          if (var3 == null) {
            break L7;
          } else {
            L8: {
              L9: {
                var4 = 10;
                var5 = 10;
                var6 = var17_ref.field_g;
                var7 = pb.field_e.a(dg.field_G[var6]) + 70;
                var8 = er.field_k;
                if (var8 < 32) {
                  break L9;
                } else {
                  if (var8 <= 303) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (var8 > 32) {
                  var8 = -var8 + 335;
                  break L10;
                } else {
                  break L10;
                }
              }
              var4 = -310 + var8 * 10;
              break L8;
            }
            oo.b(var4, var5, var7, 40, 6, 0, 160);
            oo.b(var4, var5, var7, 40, 6, 7829367);
            la.field_l[var6].b(var4 + 9, var5 + 5);
            pb.field_e.c(dg.field_G[var6], var4 - -50, 25 + var5, 16777215, 3355443);
            break L7;
          }
        }
    }

    public final void run() {
        int var1_int = 0;
        gp var2 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((tg) this).field_c = true;
        try {
            while (!((tg) this).field_h) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((tg) this).field_f[var1_int];
                    if (var2 != null) {
                        var2.a();
                    }
                }
                vd.a(false, 10L);
                Object var5 = null;
                de.a(((tg) this).field_b, (byte) 99, (Object) null);
            }
        } catch (Exception exception) {
            Object var6 = null;
            bd.a((String) null, (Throwable) (Object) exception, false);
        } finally {
            ((tg) this).field_c = false;
        }
    }

    final static void a(byte param0, boolean param1) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        String var2_ref2 = null;
        String[] var3 = null;
        bm var5 = null;
        fc var6 = null;
        ro var7 = null;
        hk[] var8 = null;
        int var9_int = 0;
        kb var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var15 = null;
        k var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        ci stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ci stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Throwable decompiledCaughtException = null;
        ci stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ci stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        ci stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 >= 23) {
              try {
                L1: {
                  L2: {
                    pp.field_n = param1;
                    df.field_I = true;
                    var2_ref2 = ta.field_lb;
                    if (var2_ref2 == null) {
                      var2_ref2 = oe.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var3 = new String[]{var2_ref2};
                    stackOut_6_0 = bn.field_d;
                    stackOut_6_1 = -85;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (!pp.field_n) {
                      stackOut_8_0 = (ci) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L3;
                    } else {
                      stackOut_7_0 = (ci) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L3;
                    }
                  }
                  var21 = ((ci) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                  var5 = (bm) (Object) sf.a((byte) -96, var21);
                  var6 = wh.a(var21, -67);
                  var7 = new ro(var3, (fc) (Object) var5);
                  var8 = new hk[4];
                  var8[0] = new hk();
                  var9_int = 0;
                  L4: while (true) {
                    if (var9_int >= 3) {
                      L5: {
                        if (!pp.field_n) {
                          var9_int = 0;
                          L6: while (true) {
                            if (var9_int >= 5) {
                              break L5;
                            } else {
                              var8[0].field_d[var9_int] = ll.field_k.field_m[var9_int];
                              var8[0].field_f[var9_int] = ll.field_k.field_g[var9_int];
                              var9_int++;
                              continue L6;
                            }
                          }
                        } else {
                          var8[0].field_d[0] = 0;
                          var8[0].field_f[0] = 255;
                          var9_int = 1;
                          L7: while (true) {
                            if (var9_int >= 5) {
                              break L5;
                            } else {
                              var22 = var8[0].field_f;
                              var20 = var22;
                              var18 = var20;
                              var15 = var18;
                              var13 = var15;
                              var10 = var13;
                              var11 = var9_int;
                              var8[0].field_d[var9_int] = 255;
                              var22[var11] = 255;
                              var9_int++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var9_int = 1;
                      L8: while (true) {
                        if (var8.length <= var9_int) {
                          var7.field_C = 2147483647;
                          var5.a((kb) (Object) var7, (byte) 53);
                          cf.field_s = new rl((kb) (Object) var7, var8, true, false);
                          var9 = new kb(var3, var6);
                          var7.field_H = 1000;
                          var16 = new k(4096);
                          var7.a(var16, (byte) -122);
                          var16.field_j = 1;
                          var9.a(2, var16);
                          var9.field_C = 2147483646;
                          var9.field_H = var7.field_H + -50;
                          wp.field_h = new qd(var9, var8[0], 0);
                          np.field_m = wp.field_h;
                          hh.field_b = true;
                          break L1;
                        } else {
                          var8[var9_int] = new hk();
                          var9_int++;
                          continue L8;
                        }
                      }
                    } else {
                      L9: {
                        L10: {
                          if (pp.field_n) {
                            break L10;
                          } else {
                            L11: {
                              if (!h.i(51603)) {
                                break L11;
                              } else {
                                if (!jk.a((byte) -128, ll.field_k.field_s[var9_int])) {
                                  break L11;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var8[0].field_c[var9_int] = ll.field_k.field_s[var9_int];
                            var7.field_e[0] = cp.a(var7.field_e[0], 1L << ll.field_k.field_s[var9_int]);
                            break L9;
                          }
                        }
                        var8[0].field_c[var9_int] = 255;
                        break L9;
                      }
                      var9_int++;
                      continue L4;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L12: {
                  var2 = (Exception) (Object) decompiledCaughtException;
                  var2.printStackTrace();
                  break L12;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2_ref, "tg.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        field_e = null;
    }

    final static ja[] a(int param0) {
        ja[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = new ja[qc.field_v];
        var2 = 0;
        L0: while (true) {
          if (qc.field_v <= var2) {
            fd.h((byte) 125);
            return var1;
          } else {
            var3 = vj.field_p[var2] * oq.field_w[var2];
            var23 = qp.field_t[var2];
            if (!ll.field_h[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = tp.field_t[tq.b(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = vf.field_b[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (ja) (Object) new rf(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = cr.b(tp.field_t[tq.b((int) var23[var7], 255)], tq.b(255, (int) var24[var7]) << 24);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    tg() {
        ((tg) this).field_f = new gp[2];
        ((tg) this).field_h = false;
        ((tg) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
    }
}
