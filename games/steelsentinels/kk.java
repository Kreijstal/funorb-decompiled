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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = SteelSentinels.field_G;
        var5 = 0;
        var6 = -1;
        var7 = 75 % ((-15 - param1) / 46);
        var8 = 1;
        L0: while (true) {
          if (param3.length() <= var8) {
            return;
          } else {
            L1: {
              var9 = param3.charAt(var8);
              if (var9 == 60) {
                var6 = param0.field_f[0] + (var5 >> 1511614696) + param4.c(param3.substring(0, var8));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != var6) {
                param0.field_f[var8] = var6;
                break L2;
              } else {
                L3: {
                  if (32 == var9) {
                    var5 = var5 + param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0.field_f[var8] = param0.field_f[0] + ((var5 >> -1964744856) + (param4.c(param3.substring(0, var8 + 1)) + -param4.a((char) var9)));
                break L2;
              }
            }
            if (var9 == 62) {
              var6 = -1;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
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
        int var4 = SteelSentinels.field_G;
        if (param0 != 34) {
            Object var5 = null;
            kk.a((il) null, -122, -42, (String) null, (mi) null);
        }
        int[] var6 = ck.field_c;
        int[] var1 = var6;
        int var2 = 0;
        int var3 = var6.length;
        while (var3 > var2) {
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
        }
    }

    final static String a(nk param0, int param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nk var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        Object var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        nk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        nk stackOut_1_0 = null;
        L0: {
          var10 = SteelSentinels.field_G;
          var19 = new int[16];
          var17 = var19;
          var15 = var17;
          var13 = var15;
          var12 = var13;
          var20 = var12;
          var18 = var20;
          var16 = var18;
          var14 = var16;
          var2 = var14;
          var3 = wl.a(var19, 0, true, param0);
          var4 = ub.a(127, param0.field_N);
          if (0 > var4) {
            stackOut_2_0 = null;
            stackIn_3_0 = (nk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ul.a(var4, (byte) 67);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var5 != null) {
            var3 = wl.a(var19, var3, true, var5);
            break L1;
          } else {
            break L1;
          }
        }
        var6_int = 0;
        L2: while (true) {
          if (var6_int >= var3 - 1) {
            var6 = null;
            var7 = 0;
            L3: while (true) {
              if (var3 <= var7) {
                L4: {
                  if (param1 == -4097) {
                    break L4;
                  } else {
                    var11 = null;
                    kk.a((il) null, -28, -91, (String) null, (mi) null);
                    break L4;
                  }
                }
                return var6;
              } else {
                var8 = 1;
                L5: while (true) {
                  L6: {
                    if (var8 + var7 >= var3) {
                      break L6;
                    } else {
                      if (var20[var7] != var2[var7 + var8]) {
                        break L6;
                      } else {
                        var8++;
                        continue L5;
                      }
                    }
                  }
                  L7: {
                    var9 = dc.a(var20[var7], 32);
                    if (var9 == null) {
                      break L7;
                    } else {
                      if (var6 == null) {
                        var6 = db.a(hf.field_a, param1 ^ 4221, new String[2]);
                        break L7;
                      } else {
                        var6 = db.a(q.field_a, param1 ^ 4141, new String[3]);
                        var7 = var7 + var8;
                        continue L3;
                      }
                    }
                  }
                  var7 = var7 + var8;
                  continue L3;
                }
              }
            }
          } else {
            var7 = var6_int;
            var8 = 1 + var6_int;
            L8: while (true) {
              if (var3 <= var8) {
                var12 = var20;
                if (var7 != var6_int) {
                  var8 = var19[var6_int];
                  var12[var6_int] = var19[var7];
                  var19[var7] = var8;
                  var6_int++;
                  continue L2;
                } else {
                  var6_int++;
                  continue L2;
                }
              } else {
                if (var19[var8] < var19[var7]) {
                  var7 = var8;
                  var8++;
                  continue L8;
                } else {
                  var8++;
                  continue L8;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -28548) {
            field_g = null;
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
            field_e = null;
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
            if (param1 > -257) {
              if (0 > param1) {
                return -1;
              } else {
                return td.field_Xb[param1] >> 1589347532;
              }
            } else {
              if (-4097 > param1) {
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
        if (param6 != 1073741824) {
            field_a = null;
        }
        la.field_c = param8;
        an.field_i = new dd(param0, param7, param4, param5, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0>: <%1>";
        field_b = new int[128];
        field_a = null;
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_h = new String[]{"Light", "Heavy", "Ordnance", "Rocket", "Large rocket", "Nuke"};
    }
}
