/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_e;
    static String field_f;
    static int[] field_b;
    static int[] field_g;
    static gh field_a;
    static String[] field_h;
    static int field_d;
    static ak field_c;

    final static void a(il param0, int param1, int param2, String param3, mi param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 75 % ((-15 - param1) / 46);
            var8 = 1;
            L1: while (true) {
              if (param3.length() <= var8) {
                break L0;
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (var9 == 60) {
                    var6 = param0.field_f[0] + (var5_int >> 1511614696) + param4.c(param3.substring(0, var8));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != var6) {
                    param0.field_f[var8] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (32 == var9) {
                        var5_int = var5_int + param2;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0.field_f[var8] = param0.field_f[0] + ((var5_int >> -1964744856) + (param4.c(param3.substring(0, var8 + 1)) + -param4.a((char) var9)));
                    break L3;
                  }
                }
                L5: {
                  if (var9 == 62) {
                    var6 = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("kk.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 > -95) {
            return;
        }
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_h = null;
    }

    final static void b(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        mi var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                var5 = (mi) null;
                kk.a((il) null, -122, -42, (String) null, (mi) null);
                break L1;
              }
            }
            var6 = ck.field_c;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "kk.A(" + param0 + ')');
        }
    }

    final static String a(nk param0, int param1) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        nk var5 = null;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        mi var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        nk stackIn_4_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        nk stackOut_2_0 = null;
        Object stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var15 = new int[16];
              var13 = var15;
              var12 = var13;
              var16 = var12;
              var14 = var16;
              var2_array = var14;
              var3 = wl.a(var15, 0, true, param0);
              var4 = ub.a(127, param0.field_N);
              if (0 > var4) {
                stackOut_3_0 = null;
                stackIn_4_0 = (nk) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = ul.a(var4, (byte) 67);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              if (var5 != null) {
                var3 = wl.a(var15, var3, true, var5);
                break L2;
              } else {
                break L2;
              }
            }
            var6_int = 0;
            L3: while (true) {
              if (var6_int >= var3 - 1) {
                var6 = null;
                var7 = 0;
                L4: while (true) {
                  if (var3 <= var7) {
                    L5: {
                      if (param1 == -4097) {
                        break L5;
                      } else {
                        var11 = (mi) null;
                        kk.a((il) null, -28, -91, (String) null, (mi) null);
                        break L5;
                      }
                    }
                    stackOut_30_0 = var6;
                    stackIn_31_0 = stackOut_30_0;
                    break L0;
                  } else {
                    var8 = 1;
                    L6: while (true) {
                      L7: {
                        if (var8 + var7 >= var3) {
                          break L7;
                        } else {
                          if (var16[var7] != var2_array[var7 + var8]) {
                            break L7;
                          } else {
                            var8++;
                            continue L6;
                          }
                        }
                      }
                      L8: {
                        var9 = dc.a(var16[var7], 32);
                        if (var9 == null) {
                          break L8;
                        } else {
                          if (var6 == null) {
                            var6 = db.a(hf.field_a, param1 ^ 4221, new String[]{Integer.toString(var8), var9});
                            break L8;
                          } else {
                            var6 = db.a(q.field_a, param1 ^ 4141, new String[]{(String) (var6), Integer.toString(var8), var9});
                            break L8;
                          }
                        }
                      }
                      var7 = var7 + var8;
                      continue L4;
                    }
                  }
                }
              } else {
                var7 = var6_int;
                var8 = 1 + var6_int;
                L9: while (true) {
                  if (var3 <= var8) {
                    if (var7 != var6_int) {
                      var8 = var15[var6_int];
                      var12[var6_int] = var15[var7];
                      var15[var7] = var8;
                      var6_int++;
                      continue L3;
                    } else {
                      var6_int++;
                      continue L3;
                    }
                  } else {
                    if (var15[var8] < var15[var7]) {
                      var7 = var8;
                      var8++;
                      continue L9;
                    } else {
                      var8++;
                      continue L9;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("kk.G(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_31_0);
    }

    final static boolean a(int param0) {
        if (param0 != -28548) {
            field_g = (int[]) null;
        }
        return (nb.field_G ^ -1L) == (nf.field_b.field_fc ^ -1L) ? true : false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        L0: {
          if (param2 == -22967) {
            break L0;
          } else {
            field_e = (String) null;
            break L0;
          }
        }
        L1: {
          var4 = param1 >> 1347061951;
          param1 = param1 - -var4 ^ var4;
          var4 = param0 >> -903614753;
          param0 = param0 + var4 ^ var4;
          var3 = 0;
          if (param0 <= param1) {
            break L1;
          } else {
            var4 = param1;
            param1 = param0;
            param0 = var4;
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) <= -32769) {
            L3: {
              if (1073741824 <= param1) {
                var3 += 16;
                param1 = param1 >> 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (4194304 <= param1) {
                param1 = param1 >> 8;
                var3 += 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((param1 ^ -1) <= -262145) {
                param1 = param1 >> 4;
                var3 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 < 65536) {
                break L6;
              } else {
                var3 += 2;
                param1 = param1 >> 2;
                break L6;
              }
            }
            L7: {
              if (param1 < 32768) {
                break L7;
              } else {
                param1 = param1 >> 1;
                var3++;
                break L7;
              }
            }
            param0 = param0 >> var3;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 << 1818235013 < param1) {
          return param1 << var3;
        } else {
          param1 = param0 * param0 + param1 * param1;
          if (65536 <= param1) {
            if (param1 < 16777216) {
              if (1048576 > param1) {
                if ((param1 ^ -1) > -262145) {
                  return td.field_Xb[param1 >> 946003754] >> 371519911;
                } else {
                  return td.field_Xb[param1 >> -513054836] >> -1480476410;
                }
              } else {
                if ((param1 ^ -1) > -4194305) {
                  return td.field_Xb[param1 >> -1807815538] >> -766429755;
                } else {
                  return td.field_Xb[param1 >> -915921104] >> 1802344868;
                }
              }
            } else {
              if ((param1 ^ -1) <= -268435457) {
                if (1073741824 <= param1) {
                  return td.field_Xb[param1 >> -1986353928] << var3;
                } else {
                  L8: {
                    if (var3 >= 1) {
                      stackOut_49_0 = td.field_Xb[param1 >> 1479211958] << -1 + var3;
                      stackIn_50_0 = stackOut_49_0;
                      break L8;
                    } else {
                      stackOut_48_0 = td.field_Xb[param1 >> 828481174] >> -var3 + 1;
                      stackIn_50_0 = stackOut_48_0;
                      break L8;
                    }
                  }
                  return stackIn_50_0;
                }
              } else {
                if (67108864 > param1) {
                  L9: {
                    if (3 <= var3) {
                      stackOut_44_0 = td.field_Xb[param1 >> -2027394926] << -3 + var3;
                      stackIn_45_0 = stackOut_44_0;
                      break L9;
                    } else {
                      stackOut_43_0 = td.field_Xb[param1 >> -422745358] >> 3 + -var3;
                      stackIn_45_0 = stackOut_43_0;
                      break L9;
                    }
                  }
                  return stackIn_45_0;
                } else {
                  L10: {
                    if ((var3 ^ -1) <= -3) {
                      stackOut_40_0 = td.field_Xb[param1 >> 1255765908] << var3 - 2;
                      stackIn_41_0 = stackOut_40_0;
                      break L10;
                    } else {
                      stackOut_39_0 = td.field_Xb[param1 >> -2123161324] >> 2 - var3;
                      stackIn_41_0 = stackOut_39_0;
                      break L10;
                    }
                  }
                  return stackIn_41_0;
                }
              }
            }
          } else {
            if ((param1 ^ -1) > -257) {
              if (0 > param1) {
                return -1;
              } else {
                return td.field_Xb[param1] >> 1589347532;
              }
            } else {
              if (-4097 < (param1 ^ -1)) {
                if ((param1 ^ -1) <= -1025) {
                  return td.field_Xb[param1 >> -1653313244] >> 740687434;
                } else {
                  return td.field_Xb[param1 >> 1547518338] >> -766612213;
                }
              } else {
                if (16384 <= param1) {
                  return td.field_Xb[param1 >> -490389592] >> -394848504;
                } else {
                  return td.field_Xb[param1 >> -1361597018] >> -927866263;
                }
              }
            }
          }
        }
    }

    final static void a(gh param0, int param1, int param2, int[] param3, String param4, String param5, int param6, long param7, kg param8) {
        try {
            if (param6 != 1073741824) {
                field_a = (gh) null;
            }
            la.field_c = param8;
            an.field_i = new dd(param0, param7, param4, param5, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "kk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "<%0>: <%1>";
        field_b = new int[128];
        field_a = null;
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_h = new String[]{"Light", "Heavy", "Ordnance", "Rocket", "Large rocket", "Nuke"};
    }
}
